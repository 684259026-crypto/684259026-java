# Attractions Web Page

This is a web page that displays attractions data fetched from the API: https://www.melivecode.com/api/attractions

## Features

- Responsive grid layout displaying attraction cards
- Each card shows:
  - Attraction name
  - Detailed description
  - Cover image
  - Geographic coordinates (latitude/longitude)
  - Creation date
- Hover effects for better user experience
- Error handling for API failures
- Loading state while fetching data

## How to View

### Method 1: Direct File Opening
Simply double-click on `attractions.html` to open it in your default browser.

### Method 2: Local Server (if needed)
If you encounter CORS issues or want to serve it properly:

1. **Using Python** (if installed):
   ```bash
   python -m http.server 8000
   ```
   Then visit: http://localhost:8000

2. **Using Node.js** (if installed):
   ```bash
   npx serve .
   ```
   Or create a simple server file.

## Data Source

The attractions data is fetched from: https://www.melivecode.com/api/attractions

This API returns information about famous attractions worldwide including:
- Phi Phi Islands (Thailand)
- Eiffel Tower (France)
- Times Square (USA)
- Mount Fuji (Japan)
- And many more...

## Files Included

- `attractions.html` - Main web page with HTML, CSS, and JavaScript
- `README.md` - This documentation file

## Technical Details

- Built with vanilla HTML, CSS, and JavaScript
- Uses modern CSS Grid for responsive layout
- Implements async/await for API calls
- Includes error handling and loading states
- Mobile-responsive design