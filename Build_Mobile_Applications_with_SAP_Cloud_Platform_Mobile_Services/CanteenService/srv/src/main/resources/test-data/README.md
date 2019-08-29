For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file BookingSet.json:

''' JSON
[
    {
        "BookingDate": "2019-08-29T10:46:56.492Z",
        "BookingID": 101,
        "DishMenuID": 301,
        "MenuID": 1234567890123,
        "Price": 12345678.12,
        "Status": "ABCDEFGHIJKLMNOPQRST",
        "User": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "BookingDate": "2019-08-29T10:46:56.492Z",
        "BookingID": 102,
        "DishMenuID": 302,
        "MenuID": 9876543210987,
        "Price": 98765432.98,
        "Status": "XYZ",
        "User": "XYZ"
    }
]
'''

Sample test data for file CanteenSet.json:

''' JSON
[
    {
        "CanteenID": 201,
        "Location": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "MenuID": 1234567890123,
        "Name": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "CanteenID": 202,
        "Location": "XYZ",
        "MenuID": 9876543210987,
        "Name": "XYZ"
    }
]
'''

Sample test data for file DishMenuSet.json:

''' JSON
[
    {
        "BookingID": 1234567890123,
        "CanteenID": 201,
        "Dessert": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "DishMenuID": 301,
        "MainDish": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Price": 12345678.12,
        "Sides": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "Soup": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "dateOfLunch": "2019-08-29T10:46:56.492Z",
        "kcalForMain": 123,
        "veggie": false
    },
    {
        "BookingID": 9876543210987,
        "CanteenID": 202,
        "Dessert": null,
        "DishMenuID": 302,
        "MainDish": "XYZ",
        "Price": 98765432.98,
        "Sides": "XYZ",
        "Soup": null,
        "dateOfLunch": "2019-08-29T10:46:56.492Z",
        "kcalForMain": 789,
        "veggie": null
    }
]
'''
