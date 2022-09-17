<%-- 
    Document   : CarritoListado
    Created on : 6 jul. 2022, 22:49:21
    Author     : kuzni
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<jsp:include page="WEB-INF/Secciones/InicioHTML.jsp"/>
<jsp:include page="WEB-INF/Secciones/InicioHead.jsp"/>
<title>Productos</title>
<jsp:include page="WEB-INF/Secciones/FinHead.jsp"/>

<jsp:include page="WEB-INF/Secciones/Nav.jsp"/>

<section class="py-3">
    <div class="container">
        <div class="row">
            <h1 class="h3">Carrito</h1>
            <p class="lead">Se listan todos los Productos que agregaste al carrito</p>
            
            <div>
                <a href="${pageContext.request.contextPath}/App" class="btn btn-success">Agregar mas Producto</a>
            </div>
        </div>
        <c:choose >
            <c:when test="${listProductosEnCarrito.size() != 0}">
                <div class="row g-4 mt-3 row-cols-xl-1" data-masonry='{"percentPosition": true }' >
                    <jsp:include page="WEB-INF/Partes/Cartas/cardProductosCarrito.jsp" />
                </div> 
            </c:when>
            <c:otherwise>
                <div class="row mt-4">
                    <div class="col-12">
                        <p class="display-5 text-danger">Ooops! Parece que no hay Productos en el carrito...RAPIDO ANDA Y AGREGA PRODUCTOS ANTES DE QUE SE TOME EL PALO EL MINISTRO DE ECONOMIA</p>
                    </div>
                </div>
            </c:otherwise>
        </c:choose>
        
    </div>
</section>


<jsp:include page="WEB-INF/Partes/modalAgregarProducto.jsp"/>
<script src="scripts/fotobase64.js"></script>
<jsp:include page="WEB-INF/Secciones/FinHTML.jsp"/>
