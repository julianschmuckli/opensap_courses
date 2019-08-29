For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file BookingSet.json:

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
