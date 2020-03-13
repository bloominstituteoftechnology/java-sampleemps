# Java Sample Employee Data

## Introduction

This project is used to introduction Java Spring REST API CRUD applications. As such it is a small application showing just the code that is needed to explain the topic.

## Database layout

The table layouts are as follows:

- Employee is the driving table
- Email has a Many-To-One relationship with Employee. Each employee has many emails. Each email has only one employee.
- Jobtitles has a Many-To-Many relationship with Employee

![Image of Database Layout](../sampleemps-db.png)

Using the provided seed data, the given endpoint will product the stated output. Expand each endpoint to see it correct output.

<details>
<summary>http://localhost:2019/employees/employees</summary>

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
        "salary": 80000.0,
        "employeeid": 3,
        "name": "CINNAMON",
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
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 80000.0,
        "employeeid": 6,
        "name": "BARNBARN",
        "emails": [
            {
                "emailid": 7,
                "email": "barnbarn@local.com"
            }
        ]
    },
    {
        "jobtitles": [],
        "salary": 75000.0,
        "employeeid": 8,
        "name": "JOHN",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 119128.14752680826,
        "employeeid": 9,
        "name": "Hollis Sawayn III",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 140378.73096999162,
        "employeeid": 10,
        "name": "Leonardo Kovacek",
        "emails": [
            {
                "emailid": 11,
                "email": "harris.prosacco@gmail.com"
            },
            {
                "emailid": 12,
                "email": "everette.kshlerin@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 143082.31688713594,
        "employeeid": 13,
        "name": "Eva Hessel DVM",
        "emails": [
            {
                "emailid": 14,
                "email": "julieta.bogisich@yahoo.com"
            },
            {
                "emailid": 15,
                "email": "chauncey.predovic@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 100682.15571583505,
        "employeeid": 16,
        "name": "Christopher Boyer V",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 122798.93659847471,
        "employeeid": 17,
        "name": "Ok Schoen",
        "emails": [
            {
                "emailid": 18,
                "email": "valentin.rodriguez@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 92286.141376001,
        "employeeid": 19,
        "name": "Martin Nikolaus",
        "emails": [
            {
                "emailid": 20,
                "email": "columbus.lakin@yahoo.com"
            },
            {
                "emailid": 21,
                "email": "percy.bednar@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 56400.06589577136,
        "employeeid": 22,
        "name": "Christie Huels",
        "emails": [
            {
                "emailid": 23,
                "email": "roosevelt.murphy@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 116045.62475307791,
        "employeeid": 24,
        "name": "Margarette Jones",
        "emails": [
            {
                "emailid": 25,
                "email": "jere.west@yahoo.com"
            },
            {
                "emailid": 26,
                "email": "jacinto.kilback@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 119833.32170883815,
        "employeeid": 27,
        "name": "Miss Lisa Heller",
        "emails": [
            {
                "emailid": 28,
                "email": "errol.orn@hotmail.com"
            },
            {
                "emailid": 29,
                "email": "buck.hessel@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 102141.75782274158,
        "employeeid": 30,
        "name": "Dr. Wilford Kris",
        "emails": [
            {
                "emailid": 31,
                "email": "peggy.bergstrom@yahoo.com"
            },
            {
                "emailid": 32,
                "email": "rich.conn@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 67305.56777049304,
        "employeeid": 33,
        "name": "Desmond Willms",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 74469.53704082486,
        "employeeid": 34,
        "name": "Lonny Wuckert",
        "emails": [
            {
                "emailid": 35,
                "email": "cristine.monahan@hotmail.com"
            },
            {
                "emailid": 36,
                "email": "genaro.kuphal@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 75852.84114005679,
        "employeeid": 37,
        "name": "Marisa Jacobson DVM",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 135345.84504424315,
        "employeeid": 38,
        "name": "Isabelle Bashirian",
        "emails": [
            {
                "emailid": 39,
                "email": "donald.gleason@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 60449.50301565214,
        "employeeid": 40,
        "name": "Rex Konopelski",
        "emails": [
            {
                "emailid": 41,
                "email": "alejandro.balistreri@gmail.com"
            },
            {
                "emailid": 42,
                "email": "tracy.boyle@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 133526.2645226284,
        "employeeid": 43,
        "name": "Ulysses Kilback",
        "emails": [
            {
                "emailid": 44,
                "email": "randy.wilkinson@yahoo.com"
            },
            {
                "emailid": 45,
                "email": "foster.orn@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 131178.41328604738,
        "employeeid": 46,
        "name": "Ruthanne Kuhn",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 73812.24720156766,
        "employeeid": 47,
        "name": "Dane Morissette MD",
        "emails": [
            {
                "emailid": 48,
                "email": "renato.wintheiser@gmail.com"
            },
            {
                "emailid": 49,
                "email": "spencer.rogahn@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 59129.024646493315,
        "employeeid": 50,
        "name": "Eldon Moore",
        "emails": [
            {
                "emailid": 51,
                "email": "kendra.will@hotmail.com"
            },
            {
                "emailid": 52,
                "email": "bernardina.hane@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 136970.76681566585,
        "employeeid": 53,
        "name": "Lacy Blanda",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 81085.44694327582,
        "employeeid": 54,
        "name": "Odis D'Amore",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 94402.04426711016,
        "employeeid": 55,
        "name": "Kiyoko Bins",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 79680.58687512022,
        "employeeid": 56,
        "name": "Jinny Wehner MD",
        "emails": [
            {
                "emailid": 57,
                "email": "dale.ward@hotmail.com"
            },
            {
                "emailid": 58,
                "email": "lyle.roberts@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 51667.49904641672,
        "employeeid": 59,
        "name": "Dagmar Flatley II",
        "emails": []
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 82974.93750150778,
        "employeeid": 60,
        "name": "Omer Wolff",
        "emails": [
            {
                "emailid": 61,
                "email": "ute.renner@hotmail.com"
            },
            {
                "emailid": 62,
                "email": "tawanda.kertzmann@yahoo.com"
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
        "salary": 80000.0,
        "employeeid": 3,
        "name": "CINNAMON",
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
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 67305.56777049304,
        "employeeid": 33,
        "name": "Desmond Willms",
        "emails": []
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
        "salary": 80000.0,
        "employeeid": 3,
        "name": "CINNAMON",
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
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 80000.0,
        "employeeid": 6,
        "name": "BARNBARN",
        "emails": [
            {
                "emailid": 7,
                "email": "barnbarn@local.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 140378.73096999162,
        "employeeid": 10,
        "name": "Leonardo Kovacek",
        "emails": [
            {
                "emailid": 11,
                "email": "harris.prosacco@gmail.com"
            },
            {
                "emailid": 12,
                "email": "everette.kshlerin@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 140378.73096999162,
        "employeeid": 10,
        "name": "Leonardo Kovacek",
        "emails": [
            {
                "emailid": 11,
                "email": "harris.prosacco@gmail.com"
            },
            {
                "emailid": 12,
                "email": "everette.kshlerin@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 143082.31688713594,
        "employeeid": 13,
        "name": "Eva Hessel DVM",
        "emails": [
            {
                "emailid": 14,
                "email": "julieta.bogisich@yahoo.com"
            },
            {
                "emailid": 15,
                "email": "chauncey.predovic@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 143082.31688713594,
        "employeeid": 13,
        "name": "Eva Hessel DVM",
        "emails": [
            {
                "emailid": 14,
                "email": "julieta.bogisich@yahoo.com"
            },
            {
                "emailid": 15,
                "email": "chauncey.predovic@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 122798.93659847471,
        "employeeid": 17,
        "name": "Ok Schoen",
        "emails": [
            {
                "emailid": 18,
                "email": "valentin.rodriguez@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 92286.141376001,
        "employeeid": 19,
        "name": "Martin Nikolaus",
        "emails": [
            {
                "emailid": 20,
                "email": "columbus.lakin@yahoo.com"
            },
            {
                "emailid": 21,
                "email": "percy.bednar@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 92286.141376001,
        "employeeid": 19,
        "name": "Martin Nikolaus",
        "emails": [
            {
                "emailid": 20,
                "email": "columbus.lakin@yahoo.com"
            },
            {
                "emailid": 21,
                "email": "percy.bednar@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 56400.06589577136,
        "employeeid": 22,
        "name": "Christie Huels",
        "emails": [
            {
                "emailid": 23,
                "email": "roosevelt.murphy@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 116045.62475307791,
        "employeeid": 24,
        "name": "Margarette Jones",
        "emails": [
            {
                "emailid": 25,
                "email": "jere.west@yahoo.com"
            },
            {
                "emailid": 26,
                "email": "jacinto.kilback@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 116045.62475307791,
        "employeeid": 24,
        "name": "Margarette Jones",
        "emails": [
            {
                "emailid": 25,
                "email": "jere.west@yahoo.com"
            },
            {
                "emailid": 26,
                "email": "jacinto.kilback@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 119833.32170883815,
        "employeeid": 27,
        "name": "Miss Lisa Heller",
        "emails": [
            {
                "emailid": 28,
                "email": "errol.orn@hotmail.com"
            },
            {
                "emailid": 29,
                "email": "buck.hessel@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 119833.32170883815,
        "employeeid": 27,
        "name": "Miss Lisa Heller",
        "emails": [
            {
                "emailid": 28,
                "email": "errol.orn@hotmail.com"
            },
            {
                "emailid": 29,
                "email": "buck.hessel@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 102141.75782274158,
        "employeeid": 30,
        "name": "Dr. Wilford Kris",
        "emails": [
            {
                "emailid": 31,
                "email": "peggy.bergstrom@yahoo.com"
            },
            {
                "emailid": 32,
                "email": "rich.conn@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 102141.75782274158,
        "employeeid": 30,
        "name": "Dr. Wilford Kris",
        "emails": [
            {
                "emailid": 31,
                "email": "peggy.bergstrom@yahoo.com"
            },
            {
                "emailid": 32,
                "email": "rich.conn@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 74469.53704082486,
        "employeeid": 34,
        "name": "Lonny Wuckert",
        "emails": [
            {
                "emailid": 35,
                "email": "cristine.monahan@hotmail.com"
            },
            {
                "emailid": 36,
                "email": "genaro.kuphal@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 74469.53704082486,
        "employeeid": 34,
        "name": "Lonny Wuckert",
        "emails": [
            {
                "emailid": 35,
                "email": "cristine.monahan@hotmail.com"
            },
            {
                "emailid": 36,
                "email": "genaro.kuphal@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 135345.84504424315,
        "employeeid": 38,
        "name": "Isabelle Bashirian",
        "emails": [
            {
                "emailid": 39,
                "email": "donald.gleason@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 60449.50301565214,
        "employeeid": 40,
        "name": "Rex Konopelski",
        "emails": [
            {
                "emailid": 41,
                "email": "alejandro.balistreri@gmail.com"
            },
            {
                "emailid": 42,
                "email": "tracy.boyle@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 60449.50301565214,
        "employeeid": 40,
        "name": "Rex Konopelski",
        "emails": [
            {
                "emailid": 41,
                "email": "alejandro.balistreri@gmail.com"
            },
            {
                "emailid": 42,
                "email": "tracy.boyle@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 133526.2645226284,
        "employeeid": 43,
        "name": "Ulysses Kilback",
        "emails": [
            {
                "emailid": 44,
                "email": "randy.wilkinson@yahoo.com"
            },
            {
                "emailid": 45,
                "email": "foster.orn@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 133526.2645226284,
        "employeeid": 43,
        "name": "Ulysses Kilback",
        "emails": [
            {
                "emailid": 44,
                "email": "randy.wilkinson@yahoo.com"
            },
            {
                "emailid": 45,
                "email": "foster.orn@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 73812.24720156766,
        "employeeid": 47,
        "name": "Dane Morissette MD",
        "emails": [
            {
                "emailid": 48,
                "email": "renato.wintheiser@gmail.com"
            },
            {
                "emailid": 49,
                "email": "spencer.rogahn@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 73812.24720156766,
        "employeeid": 47,
        "name": "Dane Morissette MD",
        "emails": [
            {
                "emailid": 48,
                "email": "renato.wintheiser@gmail.com"
            },
            {
                "emailid": 49,
                "email": "spencer.rogahn@hotmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 59129.024646493315,
        "employeeid": 50,
        "name": "Eldon Moore",
        "emails": [
            {
                "emailid": 51,
                "email": "kendra.will@hotmail.com"
            },
            {
                "emailid": 52,
                "email": "bernardina.hane@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 59129.024646493315,
        "employeeid": 50,
        "name": "Eldon Moore",
        "emails": [
            {
                "emailid": 51,
                "email": "kendra.will@hotmail.com"
            },
            {
                "emailid": 52,
                "email": "bernardina.hane@gmail.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 79680.58687512022,
        "employeeid": 56,
        "name": "Jinny Wehner MD",
        "emails": [
            {
                "emailid": 57,
                "email": "dale.ward@hotmail.com"
            },
            {
                "emailid": 58,
                "email": "lyle.roberts@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 79680.58687512022,
        "employeeid": 56,
        "name": "Jinny Wehner MD",
        "emails": [
            {
                "emailid": 57,
                "email": "dale.ward@hotmail.com"
            },
            {
                "emailid": 58,
                "email": "lyle.roberts@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 82974.93750150778,
        "employeeid": 60,
        "name": "Omer Wolff",
        "emails": [
            {
                "emailid": 61,
                "email": "ute.renner@hotmail.com"
            },
            {
                "emailid": 62,
                "email": "tawanda.kertzmann@yahoo.com"
            }
        ]
    },
    {
        "jobtitles": [
            {
                "jobtitleid": 1,
                "title": "Big Boss"
            }
        ],
        "salary": 82974.93750150778,
        "employeeid": 60,
        "name": "Omer Wolff",
        "emails": [
            {
                "emailid": 61,
                "email": "ute.renner@hotmail.com"
            },
            {
                "emailid": 62,
                "email": "tawanda.kertzmann@yahoo.com"
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
No Body Data

Location Header: http://localhost:2019/employees/employee/63
Status 201 Created
```

</details>

<details>
<summary>PUT http://localhost:2019/employees/employee/13</summary>

Body

```JSON
{
    "name": "Corgie",
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
No Body Data

Status OK
```

</details>

<details>
<summary>PATCH http://localhost:2019/employees/employee/15</summary>

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
<summary>DELETE http://localhost:2019/employees/employee/13</summary>

Output

```Text
No Body Data

Status OK
```

</details>
