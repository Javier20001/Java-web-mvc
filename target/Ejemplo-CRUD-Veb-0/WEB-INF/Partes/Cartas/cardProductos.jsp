<%-- 
    Document   : cardProductos
    Created on : 27 jun. 2022, 00:18:01
    Author     : kuzni
--%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${listProductos}" var="producto"> 
    <div class="card_contenerdo">
        <div class="col">
            <div class="card">
                <div class="imagen_contenerdor" >
                    <img src="${producto.foto}" class="card-img-top" alt="Foto de ${producto.nombre}">
                </div>
                <div class="card-body">
                    <h5 class="card-title">${producto.nombre}</h5>
                    <p class="card-text">producto de ${producto.tipo} con un precio de $${producto.precio}</p>
                    <form action="${pageContext.request.contextPath}/Carrito?accion=addCarrito&ID=${producto.ID}" method="post">
                        <div>
                            <button type="submit" class="btn btn-success">Agregar Producto al carrito</button>
                        </div>
                    </form>
                    <c:choose>
                        <c:when test="${validacion == true}">
                            <form action="${pageContext.request.contextPath}/App?accion=delete&ID=${producto.ID}" method="post">
                                <div>
                                    <button type="submit" class="btn btn-success button_delete">Eliminar Producto</button>
                                </div>
                            </form>
                        </c:when>
                    </c:choose>
                </div>
            </div>
        </div>
    </div>
</c:forEach>
