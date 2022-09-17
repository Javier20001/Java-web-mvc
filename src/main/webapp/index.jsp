<%-- 
    Document   : index.jsp
    Created on : 24 jun. 2022, 19:05:25
    Author     : kuzni
--%>
<jsp:include page="WEB-INF/Secciones/InicioHTML.jsp"/>
<jsp:include page="WEB-INF/Secciones/InicioHead.jsp"/>
<title>Home</title>
<jsp:include page="WEB-INF/Secciones/FinHead.jsp"/>

<jsp:include page="WEB-INF/Secciones/Nav.jsp"/>
<main>
    <div class="Text-contenedor">
        <h1 class="Text-h1">Bienvenido a esta pagina web de productos</h1>
        <p>bienvenido esto es una pagina donde encontraras diversos productos, para acceder a ellos apriete en el siguiente boton
            <a class="Text-a" href="${pageContext.request.contextPath}/App">Ir a los productos</a>
        </p>
    </div>
</main>
<jsp:include page="WEB-INF/Secciones/footer.jsp"/>
<jsp:include page="WEB-INF/Secciones/FinHTML.jsp"/>