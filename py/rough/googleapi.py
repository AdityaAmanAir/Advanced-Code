import google.generativeai as genai

# NEVER hardcode your key! Use environment variable
import os
API_KEY = os.getenv("AIzaSyATcMoH78eBaWjHo8lWXqONVZ5ym2OHC3s")  # Set this first!

# If you must test, create new key and paste temporarily (then delete later)
# API_KEY = "your_new_key_here"

genai.configure(api_key=API_KEY)
model = genai.GenerativeModel('gemini-pro')

response = model.generate_content("Tell me a fun fact about space")
print(response.text)