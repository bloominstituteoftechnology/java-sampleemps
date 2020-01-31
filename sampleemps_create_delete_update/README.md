# Java Sample Employee Data

## Introduction

This project is used to introduction Java Spring REST API CRUD applications. As such it is a small, susynced application showing just the code that is needed to explain the topic.

## Database layout

The table layouts are as follows:

- Employee is the driving table
- Email has a Many-To-One relationship with Employee. Each employee has many emails. Each email has only one employee.
- Jobtitles has a Many-To-Many relationship with Employee

![Image of Database Layout](../sampleemps-db.png)

Using the provided seed data, the given endpoint will product the stated output. Exand each endpoint to see it correct output.

<details>
<summary>http://localhost:2019/employees/employees</summary>

```JSON
[
    {
        "employeeid": 1,
        "name": "CINNAMON",
        "emails": [
            {
                "emailid": 1,
                "email": "hops@local.com"
            },
            {
                "emailid": 2,
                "email": "bunny@hoppin.local"
            }
        ],
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            },
            {
                "jobtitleid": 2,
                "title": "Wizard"
            }
        ]
    },
    {
        "employeeid": 2,
        "name": "BARNBARN",
        "emails": [
            {
                "emailid": 3,
                "email": "barnbarn@local.com"
            }
        ],
        "jobtitles": [
            {
                "jobtitleid": 2,
                "title": "Wizard"
            }
        ]
    },
    {
        "employeeid": 3,
        "name": "JOHN",
        "emails": [],
        "jobtitles": []
    }
]
```

</details>

<details>
<summary>http://localhost:2019/employees/employeename/mon</summary>

```JSON
[
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            },
            {
                "jobtitleid": 2,
                "title": "Wizard"
            }
        ],
        "employeeid": 1,
        "name": "CINNAMON",
        "emails": [
            {
                "emailid": 1,
                "email": "hops@local.com"
            },
            {
                "emailid": 2,
                "email": "bunny@hoppin.local"
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/employees/employeeemail/com</summary>

```JSON
[
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            },
            {
                "jobtitleid": 2,
                "title": "Wizard"
            }
        ],
        "employeeid": 1,
        "name": "CINNAMON",
        "emails": [
            {
                "emailid": 1,
                "email": "hops@local.com"
            },
            {
                "emailid": 2,
                "email": "bunny@hoppin.local"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 2,
                "title": "Wizard"
            }
        ],
        "employeeid": 2,
        "name": "BARNBARN",
        "emails": [
            {
                "emailid": 3,
                "email": "barnbarn@local.com"
            }
        ]
    }
]
```

</details>

---

<details>
<summary>POST http://localhost:2019/employees/employee</summary>

Body

```JSON
{
    "jobtitles": [
        {
            "jobtitleid": 2,
            "title": "Wizard"
        }
    ],
    "name": "Mojo",
    "salary": 100000.00,
    "emails": [
        {
            "email": "mojo@local.com"
        },
        {
            "email": "corgi@home.local"
        }
    ]
}
```

Output

```Text
No Body

Location Header: http://localhost:2019/employees/employee/15
Status 201 Created
```

</details>

<details>
<summary>PUT http://localhost:2019/employees/employee/15</summary>

Body

```JSON
{
    "jobtitles": [
        {
            "jobtitleid": 1
        },
        {
            "jobtitleid": 2
        }

    ],
    "name": "Mojo",
    "salary": 80000.00,
    "emails": [
        {
            "email": "corgie@local.com"
        }
    ]
}
```

Output

```Text
No Body

Status Ok
```

</details>

<details>
<summary>PATCH http://localhost:2019/employees/employee/15</summary>

Body

```JSON

```

Output

```Text

```

</details>

<details>
<summary>DELETE http://localhost:2019/employees/employee/15</summary>

Body

```JSON

```

Output

```Text

```

</details>
