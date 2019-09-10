For each entity set, test data can optionally be provided in a file *EntitySetName.json*.

Test data is available only in "test mode", not in production mode.

Please refer to the generated TestSettings class to see the options for enabling test mode.

Sample test data for file todo_itemsSet.json:

''' JSON
[
    {
        "description": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "done": false,
        "finishDate": "2019-09-10T08:17:16.419",
        "title": "ABCDEFGHIJKLMNOPQRSTUVWXYZ",
        "todo_itemsID": "101"
    },
    {
        "description": "XYZ",
        "done": true,
        "finishDate": "2019-09-10T08:17:16.419",
        "title": "XYZ",
        "todo_itemsID": "102"
    }
]
'''
