<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Information</title>
    </head>
    <body>
        <h1>Student Information</h1>
        <form action="./StudentServlet" method="POST">
            <table>
                <tr>
                    <td>Student Id</td>
                    <td><input type="text" name="studentId" value="${student.studentId}" /></td>
                </tr>
                <tr>
                    <td>First Name</td>
                    <td><input type="text" name="firstName" value="${student.firstname}" /></td>
                </tr>
                <tr>
                    <td>Last Name</td>
                    <td><input type="text" name="lastName" value="${student.lastname}" /></td>
                </tr>
                <tr>
                    <td>Year Level</td>
                    <td><input type="text" name="yearLevel" value="${student.yearLevel}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
                 </form>
        <br>
        <table border="1">
            <th>ID</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>Year Level</th>
                <c:forEach items="${AllStudents}" var="stud">
                <tr>
                    <td>${stud.studentId}</td>
                    <td>${stud.firstname}</td>
                    <td>${stud.lastname}</td>
                    <td>${stud.yearLevel}</td>
                </tr>
            </c:forEach> 
        </table>
        </form>
                <h1>Course Information</h1>
        <form action="./CourseServlet" method="POST">
            <table>
                <tr>
                    <td>Course Id</td>
                    <td><input type="text" name="codigo" value="${curso.codigo_curso}" /></td>
                </tr>
                <tr>
                    <td>Course Name</td>
                    <td><input type="text" name="nombre" value="${curso.nombre_curso}" /></td>
                </tr>
                <tr>
                    <td>Credits</td>
                    <td><input type="text" name="creditos" value="${curso.creditos}" /></td>
                </tr>
                <tr>
                    <td>Semester</td>
                    <td><input type="text" name="semestre" value="${curso.semestre}" /></td>
                </tr>
                <tr>
                    <td># Students</td>
                    <td><input type="text" name="estudiantes" value="${curso.numero_estudiantes}" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="action" value="Add" />
                        <input type="submit" name="action" value="Edit" />
                        <input type="submit" name="action" value="Delete" />
                        <input type="submit" name="action" value="Search" />
                    </td>
                </tr>
            </table>
        </form>
        <br>
        <table border="1">
            <th>Course ID</th>
            <th>Course Name</th>
            <th>Credits</th>
            <th>Semester</th>
            <th># Students</th>
                <c:forEach items="${AllCourse}" var="course">
                <tr>
                    <td>${course.codigo_curso}</td>
                    <td>${course.nombre_curso}</td>
                    <td>${course.creditos}</td>
                    <td>${course.semestre}</td>
                    <td>${course.numero_estudiantes}</td>
                </tr>
            </c:forEach> 
        </table>
    </body>
</html>