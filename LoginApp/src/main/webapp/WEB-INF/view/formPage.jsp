<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Styled Form</title>

    <!-- Link to custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
</head>

<body>
    <div class="container mt-5">
        <div class="row">
            <div class="col-md-6 offset-md-3">
                <h2 class="text-center mb-4">User Form</h2>

                <!-- Form Begins -->
                <form:form action="processForm" modelAttribute="userModel">

                    <!-- Username Input -->
                    <div class="form-group mb-3">
                        <form:input type="text" class="form-control" placeholder="Username" path="userName" />
                    </div>

                    <!-- Password Input -->
                    <div class="form-group mb-3">
                        <form:input type="password" class="form-control" placeholder="Password" path="password" />
                    </div>

                    <!-- Country Dropdown -->
                    <div class="form-group mb-3">
                        <form:select path="country" class="form-control">
                            <form:option value="" label="Select Country" />
                            <form:option value="Egypt" label="Egypt" />
                            <form:option value="Brazil" label="Brazil" />
                            <form:option value="Saudia Arabia" label="KSA" />
                        </form:select>
                    </div>

                    <!-- Programming Language Radio Buttons -->
                    <div class="form-group mb-3">
                        <label class="form-label">Preferred Programming Language</label><br>
                        <div class="form-check form-check-inline">
                            <form:radiobutton path="programmingLanguage" value="Java" class="form-check-input" />
                            <label class="form-check-label">Java</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <form:radiobutton path="programmingLanguage" value="C#" class="form-check-input" />
                            <label class="form-check-label">C#</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <form:radiobutton path="programmingLanguage" value="PHP" class="form-check-input" />
                            <label class="form-check-label">PHP</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <form:radiobutton path="programmingLanguage" value="Ruby" class="form-check-input" />
                            <label class="form-check-label">Ruby</label>
                        </div>
                    </div>

                    <!-- Operating System Checkboxes -->
                    <div class="form-group mb-3">
                        <label class="form-label">Preferred Operating System</label><br>
                        <div class="form-check">
                            <form:checkbox path="operatingSystem" value="Linux" class="form-check-input" />
                            <label class="form-check-label">Linux</label>
                        </div>
                        <div class="form-check">
                            <form:checkbox path="operatingSystem" value="Mac OS" class="form-check-input" />
                            <label class="form-check-label">Mac OS</label>
                        </div>
                        <div class="form-check">
                            <form:checkbox path="operatingSystem" value="MS Windows" class="form-check-input" />
                            <label class="form-check-label">MS Windows</label>
                        </div>
                    </div>

                    <!-- Submit Button -->
                    <div class="form-group text-center">
                        <form:button type="submit" class="btn btn-primary">Submit</form:button>
                    </div>

                </form:form>
                <!-- Form Ends -->

            </div>
        </div>
    </div>
</body>

</html>
