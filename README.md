# User and Comment Service(Homework 2)

This repository allows to add comments to products and add users.

## Compile
```
mvn clean compile
```

## Package
```
mvn clean package
```

## How to run after packaged
```
java -jar target/second-homework-ibrahimtkk-0.0.1-SNAPSHOT.jar
```

## Postman Collection

Check your Api Documentation.

## User Controller [/api/users/]

### Get All Users [GET]

+ Request (application/json;charset=utf-8)

+ Response 201 (application/json;charset=utf-8)

    + Body
    
            [
                {
                    "id": "1",
                    "name": "ibrahim",
                    "surname": "takak",
                    "email": "ibrahim.takakk@gmail.com",
                    "phone": "055555555",
                    "username": "ibrahimtkk"
                },
                {
                    "id": "2",
                    "name": "ibrahim",
                    "surname": "takak",
                    "email": "ibrahim.takakk@gmail.com",
                    "phone": "055555555",
                    "username": "ibrahimtkk"
                }
            ]
        


### Get User By Username [/user/{username}] - [GET]

+ Parameters
    + username: ibrahimtkk (required, string) - Username of user
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            {
                "id": 4,
                "name": "44",
                "surname": "444",
                "email": "4.com",
                "phone": "4444",
                "username": "4"
            }
            
            
### Get User By Phone [/phone/{phone}] - [GET]

+ Parameters
    + phone: 4444 (required, string) - Username of user
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            {
                "id": 4,
                "name": "44",
                "surname": "444",
                "email": "4.com",
                "phone": "4444",
                "username": "4"
            }
            
            
### Save User [POST]

+ Request

            {
                "name": "99",
                "surname": "999",
                "email": "9.com",
                "phone": "9999",
                "username": "9"
            }
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            {
                "id": "9",
                "name": "99",
                "surname": "999",
                "email": "9.com",
                "phone": "9999",
                "username": "9"
            }
            
            
### Delete User [DELETE]

+ Parameters
    + username: 4 (required, string) - Username of user
    + phone   : 4444 (required, string) - Phone number of user
            
          

### Update User [PUT]

+ Request

        {
            "id": 9,
            "name": "99",
            "surname": "999",
            "email": "9.com",
            "phone": "9999",
            "username": "9"
        }
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            {
                "id": "9",
                "name": "99",
                "surname": "999",
                "email": "9.com",
                "phone": "9999",
                "username": "9"
            }
            
            
## Comment Controller [/api/comments/]

### Get Comments By User Id [/user/{userId}] - [GET]

+ Parameters
    + userId: ibrahimtkk (required, long) - User id of user
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            [
                {
                    "id": 4,
                    "comment": "Good computer for engineers",
                    "commentDate": "2021-12-20T16:56:32.776+00:00",
                    "productId": 4,
                    "userId": 3
                }
            ]
            
            
### Get Comments By Product Id [/product/{productId}] - [GET]

+ Parameters
    + productId: 44 (required, long) - Product id of product
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            [
                {
                    "id": 6,
                    "comment": "Good Bro",
                    "commentDate": "2021-12-20T16:56:32.776+00:00",
                    "productId": 6,
                    "userId": 6
                },
                {
                    "id": 4,
                    "comment": "Eat What You Kill ",
                    "commentDate": "2021-12-20T16:56:32.776+00:00",
                    "productId": 6,
                    "userId": 8
                }
            ]
            
            
### Save Comment [POST]

+ Request

            {
                "id": 4,
                "comment": "Excellent Product",
                "commentDate": "2021-12-20T16:56:32.776+00:00",
                "productId": 4,
                "userId": 3
            }
    
+ Response 200 (application/json;charset=utf-8)

    + Body
    
            {
                "id": 4,
                "comment": "Excellent Product",
                "commentDate": "2021-12-20T16:56:32.776+00:00",
                "productId": 4,
                "userId": 3
            }
            
            
### Delete User [DELETE]

+ Parameters
    + id: 4 (required, long) - Id of comment