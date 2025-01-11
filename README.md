
<body>

<h1>Contact Management System</h1>

<p>This is a Spring Boot application that manages contact details, including names, phone numbers, and email addresses. It provides a RESTful API for performing CRUD operations on contact data.</p>

<h2>Features</h2>
<ul>
    <li>Add a new contact</li>
    <li>View all contacts</li>
    <li>Search for contacts by name or phone number</li>
    <li>Update contact details</li>
    <li>Delete a contact</li>
</ul>

<h2>Technologies Used</h2>
<ul>
    <li>Spring Boot</li>
    <li>Spring Data JPA</li>
    <li>H2 Database</li>
    <li>Spring Validation</li>
    <li>Postman (for API testing)</li>
</ul>

<h2>Getting Started</h2>
<ol>
    <li>Clone the repository:</li>
    <pre><code>git clone https://github.com/your-username/ContactManagementSystem.git</code></pre>
    <li>Navigate to the project directory:</li>
    <pre><code>cd ContactManagementSystem</code></pre>
    <li>Run the application:</li>
    <pre><code>mvn spring-boot:run</code></pre>
</ol>

<h2>Endpoints</h2>
<table border="1">
    <thead>
        <tr>
            <th>Method</th>
            <th>Endpoint</th>
            <th>Description</th>
        </tr>
    </thead>
    <tbody>
        <tr>
            <td>GET</td>
            <td>/api/contacts</td>
            <td>Get all contacts</td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/api/contacts/search/name/{name}</td>
            <td>Search contacts by name</td>
        </tr>
        <tr>
            <td>GET</td>
            <td>/api/contacts/search/phone/{phoneNumber}</td>
            <td>Search contacts by phone number</td>
        </tr>
        <tr>
            <td>POST</td>
            <td>/api/contacts</td>
            <td>Add a new contact</td>
        </tr>
        <tr>
            <td>PUT</td>
            <td>/api/contacts/{id}</td>
            <td>Update a contact</td>
        </tr>
        <tr>
            <td>DELETE</td>
            <td>/api/contacts/{id}</td>
            <td>Delete a contact</td>
        </tr>
    </tbody>
</table>

<h2>Database Configuration</h2>
<p>The application uses an in-memory H2 database. You can access the H2 console at <code>http://localhost:8080/h2-console</code>.</p>
<p>Default credentials:</p>
<ul>
    <li><strong>JDBC URL:</strong> jdbc:h2:mem:testdb</li>
    <li><strong>Username:</strong> sa</li>
    <li><strong>Password:</strong> password</li>
</ul>

<h2>License</h2>
<p>This project is licensed under the MIT License. See the <code>LICENSE</code> file for details.</p>
<h3>Developed by Sfiso Vinjwa</h3>
</body>
</html>
