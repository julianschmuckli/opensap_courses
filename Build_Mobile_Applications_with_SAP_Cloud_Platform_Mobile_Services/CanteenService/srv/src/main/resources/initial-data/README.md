For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file BookingSet.json:

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

Sample initial data for file CanteenSet.json:

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

Sample initial data for file DishMenuSet.json:

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
