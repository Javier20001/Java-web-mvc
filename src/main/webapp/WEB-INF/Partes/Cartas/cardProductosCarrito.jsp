<%-- 
    Document   : cardProductosCarrito
    Created on : 13 jul. 2022, 14:59:42
    Author     : kuzni
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:forEach items="${listProductosEnCarrito}" var="producto"> 
    <div class="card mb-3" style="max-width: 540px;">
        <div class="row no-gutters">
            <div class="col-md-1">
              <img src="${producto.foto}" class="card-img-top" alt="Foto de ${producto.nombre}">
            </div>
            <div class="col-md-8">
              <div class="card-body">
                <h5 class="card-title">${producto.nombre}</h5>
                <p class="card-text">${producto.precio}</p>
              </div>
            </div>
            <form action="${pageContext.request.contextPath}/Carrito?accion=delete&ID=${producto.ID}" method="post">
                <div>
                    <button type="submit" class="btn btn-success">Eliminar Producto</button>
                </div>
            </form>
        </div>
      </div>
</c:forEach>
