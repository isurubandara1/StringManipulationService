# StringManipulationService

A simple SOAP web service using Java and JAX-WS, deployable locally or via Apache Tomcat.

---

## 🛠️ How to Run This Project Locally

### 1. Clone or Download the Project

If you're using Git:

```bash
git clone https://github.com/yourusername/StringManipulationService.git
cd StringManipulationService
```

Or download and extract the ZIP.

---

### 2. Compile the Java Classes

Make sure you have **JDK 8 or above** installed.

```bash
javac -d . src/com/example/service/*.java
```

---

### 3. Run the Web Service

```bash
java com.example.service.ServicePublisher
```

You should see:  
`Service is running...`

---

### 4. Access the SOAP WSDL

Visit in your browser or use SoapUI:

```
http://localhost:8080/StringManipulationService?wsdl
```

---

## 🚀 Optional: Deploy on Apache Tomcat

To deploy this service on Tomcat, you will need to:

- Create a `WEB-INF` folder and `web.xml`
- Package as a `.war` file
- Place it in the `webapps/` directory of your Tomcat installation

---

## 📁 Project Structure

```
src/
 └── com/
     └── example/
         └── service/
             ├── StringManipulationService.java
             ├── StringManipulationServiceImpl.java
             └── ServicePublisher.java
```

---

## 🧾 License

MIT License
