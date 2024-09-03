import pandas as pd
import requests
from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from bs4 import BeautifulSoup

options = webdriver.ChromeOptions()
options.headless = True  # Run in headless mode (no browser UI)
driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()), options=options)

product = []
price = []
description = []
ratings = []
reviews = []

url = "https://www.flipkart.com/search?q=phones+under+100000&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off&page=1"
headers = {
    "User-Agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/91.0.4472.124 Safari/537.36",
    "Accept-Language": "en-US,en;q=0.9",
    "Accept-Encoding": "gzip, deflate, br",
    "Referer": "https://www.flipkart.com/",
    "Connection": "keep-alive",
}

driver.get(url)
# Use the headers in the request
#r = requests.get(url, headers=headers)
soup = BeautifulSoup(driver.page_source, "lxml")

# Check if the request was successful
# if r.status_code == 200:
#     soup = BeautifulSoup(r.text, "lxml")
    
    # Optionally, print the entire soup object to check what HTML is being fetched
    # print(soup.prettify())
    # Find elements by class name

names = soup.find_all("div", class_="KzDlHZ")  # Adjust the class name as needed
    
    # Debugging: print the found names
print(f"Found {len(names)} products")

    # Extract and print the names
for name in names:
    print(name.text)
# else:
#     print("Failed to retrieve the webpage. Status code:", r.status_code)