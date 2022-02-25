<%-- 
    Document   : teams
    Created on : Feb 25, 2022, 11:42:24 PM
    Author     : Admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">

    <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>

    <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>

    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <style>
        .teams {
            width: 100%;
        }

        .top-teams {
            width: 100%;
            margin: 40px 0;
        }

        .top-teams h1 {
            font-size: 40px;
            color: #c70101;
            font-family: fantasy;
            text-align: center;
            text-transform: uppercase;
            margin: 5px 10px;
        }

        .top-teams .player-management {
            list-style: none;
            padding-left: 0;
            text-align: center;
        }

        .top-teams .player-management a {
            text-decoration: none;
        }

        .top-teams .player-management li {
            display: inline-block;
            background-color: #c70101;
            text-align: center;
            width: 150px;
            height: 50px;
            padding: 10px;
            font-size: 20px;
            border: 1px solid #140a47;
            color: #fff;
            margin: 5px 10px;
        }

        .top-teams .player-management li:hover {
            background-color: #fff;
            border: 1px solid #140a47;
            color: #c70101;
        }

        .top-teams .player-management li:focus {
            background-color: #fff;
            border: 1px solid #140a47;
            color: #c70101;
        }
    </style>
    <title>Document</title>
</head>

<body>
    <div class="teams">
        <div class="container">
            <div class="top-teams">
                <div class="row">
                    <div class="col-md-6">
                        <h1>Manchester United FC</h1>
                    </div>
                    <div class="col-md-6">
                        <ul class="player-management">
                            <a href="">
                                <li>Players</li>
                            </a>
                            <a href="">
                                <li>Management</li>
                            </a>
                        </ul>
                    </div>
                </div>
            </div>
            <div class="bottom-teams">
                
            </div>
        </div>
    </div>
</body>

</html>