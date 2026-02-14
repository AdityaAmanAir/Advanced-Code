from flask import Flask,  send_file,jsonify
import time
import io
import base64
from PIL import Image, ImageDraw
import threading

app = Flask(__name__)

data_sequence = [
    {"type": "text", "data": "Hello World"},
    {"type": "json", "data": {"name": "Alice", "marks": 85}},
    {"type": "ai", "data": "Gemini: Python is awesome!"},
    {"type": "weather", "data": {"temp": 72, "condition": "Sunny"}},
    {"type": "location", "data": {"lat": 40.7128, "lng": -74.0060}},
]

images = []
for i in range(5):
    img = Image.new('RGB', (200, 200), color=(i*50, i*30, i*70))
    d = ImageDraw.Draw(img)
    d.text((50, 90), f"Image {i+1}", fill='white')
    
    img_io = io.BytesIO()
    img.save(img_io, 'PNG')
    img_io.seek(0)
    images.append(img_io)

current_image = 0

@app.route('/')
def get_all():
    return jsonify(data_sequence)

@app.route('/<int:index>')
def get_one(index):
    if 0 <= index < len(data_sequence):
        return jsonify(data_sequence[index])
    return jsonify({"error": "not found"}), 404

@app.route('/img')
def get_image():
    global current_image
    print(current_image)
    img_index = current_image
    current_image = ((current_image+1 )%5) # Cycle 0,1,2,3,4,0,1,2...
    # try :
    return send_file(images[img_index], mimetype='image/png')
    # except:
    #     current_image=1
    #     img_index = current_image
    #     return send_file(images[img_index], mimetype='image/png')

@app.route('/stream')
def stream_info():
    return jsonify({
        "status": "cycling images",
        "total_images": 5,
        "current": current_image,
        "next": (current_image + 1) % 5
    })


app.run(port=5000)