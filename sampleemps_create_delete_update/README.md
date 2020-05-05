# Java Sample Employee CRUD Data

## Introduction

This project is used to introduce Java Spring REST API CRUD applications. As such it is a small application showing just the code that is needed to explain the topic.

## Database layout

The table layouts are as follows:

- Employee is the driving table
- Email has a Many-To-One relationship with Employee. Each employee has many emails. Each email has only one employee.
- Jobtitles has a Many-To-Many relationship with Employee

![Image of Database Layout](../sampleemps-db.png)

Using the provided seed data, the given endpoint will produce the stated output. Expand each endpoint to see it's correct output. Due to the random nature of using Javafaker, your actual output will probably vary!!!

<details>
<summary>http://localhost:2019/employees/employees</summary>

```JSON
[
    {
        "employeeid": 3,
        "name": "CINNAMON",
        "salary": 80000.0,
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
        "emails": [
            {
                "emailid": 4,
                "email": "hops@local.com"
            },
            {
                "emailid": 5,
                "email": "bunny@hoppin.local"
            }
        ]
    },
    {
        "employeeid": 6,
        "name": "BARNBARN",
        "salary": 80000.0,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 7,
                "email": "barnbarn@local.com"
            }
        ]
    },
    {
        "employeeid": 8,
        "name": "JOHN",
        "salary": 75000.0,
        "jobtitles": [],
        "emails": []
    },
    {
        "employeeid": 9,
        "name": "Donte Hilll",
        "salary": 57979.065072965044,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 10,
                "email": "lavonia.kertzmann@gmail.com"
            }
        ]
    },
    {
        "employeeid": 11,
        "name": "Orville Gerhold",
        "salary": 111917.77352178165,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 12,
                "email": "victor.bechtelar@yahoo.com"
            },
            {
                "emailid": 13,
                "email": "venice.bartoletti@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 14,
        "name": "Dwayne Wehner III",
        "salary": 137332.1995000462,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 15,
                "email": "royce.gorczany@gmail.com"
            }
        ]
    },
    {
        "employeeid": 16,
        "name": "Debbie McGlynn",
        "salary": 97201.81880242104,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 17,
                "email": "nilda.daniel@yahoo.com"
            },
            {
                "emailid": 18,
                "email": "jayson.parisian@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 19,
        "name": "Ms. Horace Greenholt",
        "salary": 115278.55136961937,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 20,
        "name": "Hortencia Parker",
        "salary": 91600.46382982255,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 21,
        "name": "Vallie Bosco",
        "salary": 117934.83083208356,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 22,
                "email": "gilma.bechtelar@hotmail.com"
            },
            {
                "emailid": 23,
                "email": "vertie.quitzon@gmail.com"
            }
        ]
    },
    {
        "employeeid": 24,
        "name": "Marina Parisian",
        "salary": 70104.86865072964,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 25,
                "email": "liza.beahan@hotmail.com"
            },
            {
                "emailid": 26,
                "email": "carroll.quigley@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 27,
        "name": "Rima Larson",
        "salary": 65961.8528770834,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 28,
                "email": "kimiko.lemke@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 29,
        "name": "Rodney Lowe",
        "salary": 149850.66273798535,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 30,
                "email": "emelda.ledner@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 31,
        "name": "Manuel Satterfield",
        "salary": 58489.21432691639,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 32,
                "email": "jazmine.schowalter@yahoo.com"
            },
            {
                "emailid": 33,
                "email": "everette.little@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 34,
        "name": "Linwood Runolfsdottir",
        "salary": 92237.87852876788,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 35,
        "name": "Dr. Neta Yundt",
        "salary": 141671.03892213776,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 36,
        "name": "Paul Legros",
        "salary": 138444.24324724264,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 37,
                "email": "kip.connelly@gmail.com"
            },
            {
                "emailid": 38,
                "email": "quinn.braun@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 39,
        "name": "Rod Volkman",
        "salary": 126232.6076639922,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 40,
                "email": "ruthie.bogisich@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 41,
        "name": "Giuseppe Rice",
        "salary": 120020.46386514937,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 42,
                "email": "domingo.rosenbaum@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 43,
        "name": "Eloy Kutch",
        "salary": 130132.23591651948,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 44,
                "email": "colby.macgyver@gmail.com"
            }
        ]
    },
    {
        "employeeid": 45,
        "name": "Rodolfo Johnston",
        "salary": 63800.38363702623,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 46,
        "name": "Trula Schultz",
        "salary": 63685.62932203562,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 47,
        "name": "Hortense Goodwin",
        "salary": 125217.97290081353,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 48,
                "email": "ron.bogisich@hotmail.com"
            },
            {
                "emailid": 49,
                "email": "korey.white@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 50,
        "name": "Tari Romaguera",
        "salary": 127166.00968556589,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 51,
                "email": "kyle.ohara@gmail.com"
            }
        ]
    },
    {
        "employeeid": 52,
        "name": "Mr. Orval Prosacco",
        "salary": 107675.93053377056,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 53,
                "email": "demarcus.kiehn@yahoo.com"
            },
            {
                "emailid": 54,
                "email": "frances.rolfson@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 55,
        "name": "Carl Konopelski",
        "salary": 89897.81505103297,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": []
    },
    {
        "employeeid": 56,
        "name": "Levi Baumbach III",
        "salary": 149025.67323776847,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 57,
                "email": "jarod.stokes@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 58,
        "name": "Devin Koepp III",
        "salary": 59413.499039909075,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 59,
                "email": "esperanza.cassin@hotmail.com"
            },
            {
                "emailid": 60,
                "email": "matt.fahey@gmail.com"
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
        "employeeid": 3,
        "name": "CINNAMON",
        "salary": 80000.0,
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
        "emails": [
            {
                "emailid": 4,
                "email": "hops@local.com"
            },
            {
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
        "employeeid": 3,
        "name": "CINNAMON",
        "salary": 80000.0,
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
        "emails": [
            {
                "emailid": 4,
                "email": "hops@local.com"
            },
            {
                "emailid": 5,
                "email": "bunny@hoppin.local"
            }
        ]
    },
    {
        "employeeid": 6,
        "name": "BARNBARN",
        "salary": 80000.0,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 7,
                "email": "barnbarn@local.com"
            }
        ]
    },
    {
        "employeeid": 9,
        "name": "Donte Hilll",
        "salary": 57979.065072965044,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 10,
                "email": "lavonia.kertzmann@gmail.com"
            }
        ]
    },
    {
        "employeeid": 11,
        "name": "Orville Gerhold",
        "salary": 111917.77352178165,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 12,
                "email": "victor.bechtelar@yahoo.com"
            },
            {
                "emailid": 13,
                "email": "venice.bartoletti@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 11,
        "name": "Orville Gerhold",
        "salary": 111917.77352178165,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 12,
                "email": "victor.bechtelar@yahoo.com"
            },
            {
                "emailid": 13,
                "email": "venice.bartoletti@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 14,
        "name": "Dwayne Wehner III",
        "salary": 137332.1995000462,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 15,
                "email": "royce.gorczany@gmail.com"
            }
        ]
    },
    {
        "employeeid": 16,
        "name": "Debbie McGlynn",
        "salary": 97201.81880242104,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 17,
                "email": "nilda.daniel@yahoo.com"
            },
            {
                "emailid": 18,
                "email": "jayson.parisian@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 16,
        "name": "Debbie McGlynn",
        "salary": 97201.81880242104,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 17,
                "email": "nilda.daniel@yahoo.com"
            },
            {
                "emailid": 18,
                "email": "jayson.parisian@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 21,
        "name": "Vallie Bosco",
        "salary": 117934.83083208356,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 22,
                "email": "gilma.bechtelar@hotmail.com"
            },
            {
                "emailid": 23,
                "email": "vertie.quitzon@gmail.com"
            }
        ]
    },
    {
        "employeeid": 21,
        "name": "Vallie Bosco",
        "salary": 117934.83083208356,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 22,
                "email": "gilma.bechtelar@hotmail.com"
            },
            {
                "emailid": 23,
                "email": "vertie.quitzon@gmail.com"
            }
        ]
    },
    {
        "employeeid": 24,
        "name": "Marina Parisian",
        "salary": 70104.86865072964,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 25,
                "email": "liza.beahan@hotmail.com"
            },
            {
                "emailid": 26,
                "email": "carroll.quigley@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 24,
        "name": "Marina Parisian",
        "salary": 70104.86865072964,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 25,
                "email": "liza.beahan@hotmail.com"
            },
            {
                "emailid": 26,
                "email": "carroll.quigley@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 27,
        "name": "Rima Larson",
        "salary": 65961.8528770834,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 28,
                "email": "kimiko.lemke@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 29,
        "name": "Rodney Lowe",
        "salary": 149850.66273798535,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 30,
                "email": "emelda.ledner@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 31,
        "name": "Manuel Satterfield",
        "salary": 58489.21432691639,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 32,
                "email": "jazmine.schowalter@yahoo.com"
            },
            {
                "emailid": 33,
                "email": "everette.little@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 31,
        "name": "Manuel Satterfield",
        "salary": 58489.21432691639,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 32,
                "email": "jazmine.schowalter@yahoo.com"
            },
            {
                "emailid": 33,
                "email": "everette.little@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 36,
        "name": "Paul Legros",
        "salary": 138444.24324724264,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 37,
                "email": "kip.connelly@gmail.com"
            },
            {
                "emailid": 38,
                "email": "quinn.braun@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 36,
        "name": "Paul Legros",
        "salary": 138444.24324724264,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 37,
                "email": "kip.connelly@gmail.com"
            },
            {
                "emailid": 38,
                "email": "quinn.braun@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 39,
        "name": "Rod Volkman",
        "salary": 126232.6076639922,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 40,
                "email": "ruthie.bogisich@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 41,
        "name": "Giuseppe Rice",
        "salary": 120020.46386514937,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 42,
                "email": "domingo.rosenbaum@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 43,
        "name": "Eloy Kutch",
        "salary": 130132.23591651948,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 44,
                "email": "colby.macgyver@gmail.com"
            }
        ]
    },
    {
        "employeeid": 47,
        "name": "Hortense Goodwin",
        "salary": 125217.97290081353,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 48,
                "email": "ron.bogisich@hotmail.com"
            },
            {
                "emailid": 49,
                "email": "korey.white@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 47,
        "name": "Hortense Goodwin",
        "salary": 125217.97290081353,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 48,
                "email": "ron.bogisich@hotmail.com"
            },
            {
                "emailid": 49,
                "email": "korey.white@yahoo.com"
            }
        ]
    },
    {
        "employeeid": 50,
        "name": "Tari Romaguera",
        "salary": 127166.00968556589,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 51,
                "email": "kyle.ohara@gmail.com"
            }
        ]
    },
    {
        "employeeid": 52,
        "name": "Mr. Orval Prosacco",
        "salary": 107675.93053377056,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 53,
                "email": "demarcus.kiehn@yahoo.com"
            },
            {
                "emailid": 54,
                "email": "frances.rolfson@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 52,
        "name": "Mr. Orval Prosacco",
        "salary": 107675.93053377056,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 53,
                "email": "demarcus.kiehn@yahoo.com"
            },
            {
                "emailid": 54,
                "email": "frances.rolfson@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 56,
        "name": "Levi Baumbach III",
        "salary": 149025.67323776847,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 57,
                "email": "jarod.stokes@hotmail.com"
            }
        ]
    },
    {
        "employeeid": 58,
        "name": "Devin Koepp III",
        "salary": 59413.499039909075,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 59,
                "email": "esperanza.cassin@hotmail.com"
            },
            {
                "emailid": 60,
                "email": "matt.fahey@gmail.com"
            }
        ]
    },
    {
        "employeeid": 58,
        "name": "Devin Koepp III",
        "salary": 59413.499039909075,
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "emails": [
            {
                "emailid": 59,
                "email": "esperanza.cassin@hotmail.com"
            },
            {
                "emailid": 60,
                "email": "matt.fahey@gmail.com"
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
            "jobtitleid": 2
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
No Body Data

Location Header: http://localhost:2019/employees/employee/61
Status 201 Created
```

</details>

<details>
<summary>PUT http://localhost:2019/employees/employee/11</summary>

Body

```JSON
{
    "name": "Corgie",
    "salary": 80000.00,
    "jobtitles": [
        {
            "jobtitleid": 2
        }
    ],
    "emails": [
        {
            "email": "corgie@local.com"
        }
    ]
}
```

Output

```Text
No Body Data

Status OK
```

</details>

<details>
<summary>PATCH http://localhost:2019/employees/employee/14</summary>

Body

```JSON
{
    "salary": 10000000.00,
    "emails": [
        {
            "email": "iamsomebody@local.com"
        }
    ]
}
```

Output

```Text
No Body Data

Status OK
```

</details>

<details>
<summary>DELETE http://localhost:2019/employees/employee/11</summary>

Output

```Text
No Body Data

Status OK
```

</details>
