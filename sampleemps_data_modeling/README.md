# Java Sample Employee Data Modeling with Audit Fields

## Introduction

This project is used to introduce Java Spring REST API CRUD applications. As such it is a small application showing just the code that is needed to explain the topic.

## Database layout

The table layouts are as follows:

- Employee is the driving table
- Email has a Many-To-One relationship with Employee. Each employee has many emails. Each email has only one employee.
- Jobtitles has a Many-To-Many relationship with Employee
- EmployeeTitles the join table between Jobtitles and Employee

![Image of Database Layout](sampleemps-audit-db.png)

Using the provided seed data, the given endpoint will produce the stated output. Expand each endpoint to see it's correct output. Note I am only generated 3 random Java Faker Employees

<details>
<summary>http://localhost:2019/employees/employees</summary>

```JSON
[
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 3,
        "name": "CINNAMON",
        "salary": 80000.0,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 2,
                    "title": "Wizard"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 4,
                "email": "hops@local.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 5,
                "email": "bunny@hoppin.local"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 6,
        "name": "BARNBARN",
        "salary": 80000.0,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 7,
                "email": "barnbarn@local.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 8,
        "name": "JOHN",
        "salary": 75000.0,
        "jobnames": [],
        "emails": []
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 9,
        "name": "Penney Wiegand",
        "salary": 104522.50369722086,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": []
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 10,
        "name": "Karisa Hagenes",
        "salary": 143898.7951833187,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 11,
                "email": "earnestine.marvin@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 12,
                "email": "lloyd.gusikowski@hotmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    }
]
```

</details>

<details>
<summary>http://localhost:2019/employees/employeename/mon</summary>

```JSON
[
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 3,
        "name": "CINNAMON",
        "salary": 80000.0,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 2,
                    "title": "Wizard"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 4,
                "email": "hops@local.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 5,
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
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 3,
        "name": "CINNAMON",
        "salary": 80000.0,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 2,
                    "title": "Wizard"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 4,
                "email": "hops@local.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 5,
                "email": "bunny@hoppin.local"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 6,
        "name": "BARNBARN",
        "salary": 80000.0,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 7,
                "email": "barnbarn@local.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 10,
        "name": "Karisa Hagenes",
        "salary": 143898.7951833187,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 11,
                "email": "earnestine.marvin@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 12,
                "email": "lloyd.gusikowski@hotmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 10,
        "name": "Karisa Hagenes",
        "salary": 143898.7951833187,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 11,
                "email": "earnestine.marvin@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 12,
                "email": "lloyd.gusikowski@hotmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    },
    {
        "createdBy": "SYSTEM",
        "createdDate": "2020-07-20 18:51:24",
        "lastModifiedBy": "SYSTEM",
        "lastModifiedDate": "2020-07-20 18:51:24",
        "employeeid": 13,
        "name": "Phillis Bechtelar",
        "salary": 119107.99038025294,
        "jobnames": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "jobname": {
                    "createdBy": "SYSTEM",
                    "createdDate": "2020-07-20 18:51:24",
                    "lastModifiedBy": "SYSTEM",
                    "lastModifiedDate": "2020-07-20 18:51:24",
                    "jobtitleid": 1,
                    "title": "Big Boss"
                },
                "manager": "Stumps"
            }
        ],
        "emails": [
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 14,
                "email": "neely.harber@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 15,
                "email": "lauren.koss@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 16,
                "email": "brady.johnson@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 17,
                "email": "dennis.ernser@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 18,
                "email": "valeri.bogisich@gmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 19,
                "email": "shawanda.wiegand@yahoo.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 20,
                "email": "tiara.pfannerstill@hotmail.com"
            },
            {
                "createdBy": "SYSTEM",
                "createdDate": "2020-07-20 18:51:24",
                "lastModifiedBy": "SYSTEM",
                "lastModifiedDate": "2020-07-20 18:51:24",
                "emailid": 21,
                "email": "elmer.hilpert@gmail.com"
            }
        ]
    }
]
```

</details>

<details>
<summary>POST http://localhost:2019/employees/employee</summary>

DATA

```JSON
{
    "name": "Mojo",
    "salary": 100000.00,
    "jobnames": [
        {
            "jobname":{
                "jobtitleid": 2,
                "title": "Wizard"
            },
            "manager":"stumps"
        }
    ],
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

OUTPUT

```TEXT
Location Header: http://localhost:2019/employees/employee/22
STATUS 201 Created
```

</details>

<details>
<summary>PUT http://localhost:2019/employees/employee/13</summary>

DATA

```JSON
{
    "name": "Corgie",
    "salary": 80000.00,
    "jobnames": [
        {
            "jobname":{
                "jobtitleid": 2,
                "title": "Wizard"
            },
            "manager":"stumps"
        },
        {
            "jobname":{
                "jobtitleid": 1,
                "title": "Big Boss"
            },
            "manager":"stumps"
        }
    ],
    "emails": [
        {
            "email": "hops@local.com"
        },
        {
            "email": "bunny@hoppin.local"
        }
    ]
}

```

OUTPUT

```TEXT
STATUS 200 OK
```

</details>

<details>
<summary>PATCH http://localhost:2019/employees/employee/16</summary>

DATA

```JSON
{
    "salary": 100000.00
}
```

OUTPUT

```TEXT
STATUS 200 OK
```

</details>

<details>
<summary>DELETE http://localhost:2019/employees/employee/16</summary>

OUTPUT

```TEXT
STATUS 200 OK
```

</details>

[Sample Swagger Documentation](https://drive.google.com/file/d/1EijscrIhpv6lbnSbLXcaH7NeLFCEpI2l/view)