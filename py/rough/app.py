from flask import Flask, jsonify
from datetime import datetime

app = Flask(__name__)

@app.route('/')
def current_time():
    now = datetime.now()
    return jsonify({
        "current_time": now.strftime("%H:%M:%S"),
        "current_date": now.strftime("%Y-%m-%d"),
        "full_datetime": now.strftime("%Y-%m-%d %H:%M:%S"),
        "timestamp": now.timestamp()
    })

app.run(port=5000)