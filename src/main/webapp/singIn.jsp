<%-- 
    Document   : singIn
    Created on : 2 ago. 2022, 12:40:40
    Author     : kuzni
--%>
<jsp:include page="WEB-INF/Secciones/InicioHTML.jsp"/>
<jsp:include page="WEB-INF/Secciones/InicioHead.jsp"/>
<title>Productos</title>
<jsp:include page="WEB-INF/Secciones/FinHead.jsp"/>

<jsp:include page="WEB-INF/Secciones/Nav.jsp"/>
<main>
    <div class="div__contenedor">
        <form class="div__contenedor-form" action="${pageContext.request.contextPath}/App?accion=singIN" method="post">
            <div class="div_form-INcontainer">
                <div class="div__container-input">
                    <input class="form__input Email" type="email" placeholder="Email" id="Email" name="email" required>
                </div>
                <div class="div__container-inpur">
                    <input class="form__input Contra" type="password" placeholder="Password" id="Pass" name="pass" required>
                </div>
                <div class="div__container-inpur">
                    <button type="submit" class="form__button">SingIn</button>
                </div>
                <div class="div__container-inpur">
                    <p class="form__LinkRegister">si no estas registrado aprieta aqui</p>
                    <a href="Register.html">Registrate</a>
                </div>
            </div>
        </form>
    </div>
</main>
<jsp:include page="WEB-INF/Secciones/footer.jsp"/>
<jsp:include page="WEB-INF/Secciones/FinHTML.jsp"/>
