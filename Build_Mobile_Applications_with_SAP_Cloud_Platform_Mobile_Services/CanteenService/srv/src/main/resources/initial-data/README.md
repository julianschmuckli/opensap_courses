For each entity set, initial data can optionally be provided in a file *EntitySetName.json*.

Initial data is available in production and test modes.

The sample initial data below will not be automatically used, but can be copy-pasted into JSON files.

Sample initial data for file BookingSet.json:

''' JSON
[
    {
        "BookingDate": "2019-08-29T08:20:36.163Z",
        "BookingID": 101,
        "MenuID": 1234567890123,
        "Price": 12345678.12,
        "Status": "ABCDEFGHIJKLMNOPQRST",
        "User": "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
    },
    {
        "BookingDate": "2019-08-29T08:20:36.163Z",
        "BookingID": 102,
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
