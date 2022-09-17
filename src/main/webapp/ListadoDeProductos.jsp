<%-- 
    Document   : ListadoDeProductos
    Created on : 26 jun. 2022, 23:58:23
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
            <h1 class="h3">Listado de Productos</h1>
            <p class="lead">Se listan todos los Productos existentes en la base de datos</p>
            
            <div>
                <a href="#" class="btn btn-success" data-bs-toggle="modal" data-bs-target="#modalAgregarProducto">Agregar Producto</a>
            </div>
            <div>
                <a href="${pageContext.request.contextPath}/Carrito"  class="btn btn-success" >ir al Carrito</a>
            </div>
        </div>
        <c:choose >
            <c:when test="${listProductos != null && !lista.isEmpty()}">
                <div class="row g-4 mt-3 row-cols-1 row-cols-sm-2 row-cols-lg-3 row-cols-xl-4 row-cols-xxl-5" data-masonry='{"percentPosition": true }' >
                    <jsp:include page="WEB-INF/Partes/Cartas/cardProductos.jsp" />
                </div> 
            </c:when>
            <c:otherwise>
                <div class="row mt-4">
                    <div class="col-12">
                        <p class="display-5 text-danger">Ooops! Parece que no hay Productos...</p>
                    </div>
                </div>
            </c:otherwise>
        </c:choose>
        
    </div>
</section>


<jsp:include page="WEB-INF/Partes/modalAgregarProducto.jsp"/>
<script src="scripts/fotobase64.js"></script>
<jsp:include page="WEB-INF/Secciones/footer.jsp"/>
<jsp:include page="WEB-INF/Secciones/FinHTML.jsp"/>