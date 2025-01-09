<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>User Form</title>
    <!-- Bootstrap CSS -->
    <link href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
    <div class="container mt-5">
        <div class="card shadow-sm">
            <div class="card-body">
                <h2 class="text-center mb-4">User Form</h2>
                <form>
                    <!-- Username Field -->
                    <div class="form-group">
                        <label for="username">Username</label>
                        <input type="text" class="form-control" id="username" placeholder="Administrator">
                    </div>

                    <!-- Password Field -->
                    <div class="form-group">
                        <label for="password">Password</label>
                        <input type="password" class="form-control" id="password" placeholder="*********">
                    </div>

                    <!-- Country Dropdown -->
                    <div class="form-group">
                        <label for="country">Country</label>
                        <select class="form-control" id="country">
                            <option>Brazil</option>
                            <option>USA</option>
                            <option>India</option>
                            <option>Egypt</option>
                        </select>
                    </div>

                    <!-- Preferred Programming Language -->
                    <div class="form-group">
                        <label>Preferred Programming Language</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="java" value="Java" checked>
                            <label class="form-check-label" for="java">Java</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="csharp" value="C#">
                            <label class="form-check-label" for="csharp">C#</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="php" value="PHP">
                            <label class="form-check-label" for="php">PHP</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="language" id="ruby" value="Ruby">
                            <label class="form-check-label" for="ruby">Ruby</label>
                        </div>
                    </div>

                    <!-- Preferred Operating System -->
                    <div class="form-group">
                        <label>Preferred Operating System</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="linux" value="Linux" checked>
                            <label class="form-check-label" for="linux">Linux</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="macos" value="Mac OS" checked>
                            <label class="form-check-label" for="macos">Mac OS</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" id="windows" value="MS Windows">
                            <label class="form-check-label" for="windows">MS Windows</label>
                        </div>
                    </div>

                    <!-- Submit Button -->
                    <button type="submit" class="btn btn-danger btn-block">Submit</button>
                </form>
            </div>
        </div>
    </div>

    <!-- Bootstrap JS and Dependencies -->
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.4.4/dist/umd/popper.min.js"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</body>
</html>
