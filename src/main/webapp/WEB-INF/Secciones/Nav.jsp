<%-- 
    Document   : Nav.jsp
    Created on : 25 jun. 2022, 11:50:42
    Author     : kuzni
--%>
<header>
    <nav class="nav">
        <ul class="nav-Ul">
            <div class="nav__Ul-contenedor">
                <li class="nav-li"><i class="fas fa-house"></i><a href="${pageContext.request.contextPath}/index.jsp">Home</a></li>
                <li class="nav-li"><i class="fa-solid fa-arrow-right-to-bracket"></i></i><a href="${pageContext.request.contextPath}/singIn.jsp">Sign in</a></li>
                <li class="nav-li"><i class="fa-solid fa-arrow-right-from-bracket"></i></i><a href="#" onclick="Desconectar()">Sign out</a></li>
                <li class="nav-li"><i class="fas fa-user"></i><a href="${pageContext.request.contextPath}/App">App</a></li>
            </div>
        </ul>
        <ul class="nav__Responsive-Ul">
            <div class="nav__Responsive-Buttom-Contenedor">
                <div class="nav__Responsive-ContenedorButtom fa-solid fa-bars">
                </div>
            </div>
            <div class="nav__Responsive-contenedor">
                <li class="nav__Responsive-li"><i class="fas fa-house"></i><a href="Responsive_desing.html">Home</a></li>
                <li class="nav__Responsive-li"><i class="fa-solid fa-arrow-right-to-bracket"></i></i><a href="signIn.jsp">Sign in</a></li>
                <li class="nav__Responsive-li"><i class="fa-solid fa-arrow-right-from-bracket"></i></i><a href="#">Sign out</a></li>
                <li class="nav__Responsive-li"><i class="fas fa-user"></i><a href="#">About us</a></li>
                <div class="nav__responsive-contenedorRedes">
                    <li class="nav__Responsive-li-Redes"><a href="https://www.instagram.com/javier_kuznik___/" target="_BLANK"><i class="fa-brands fa-instagram"></i></a></li>
                    <li class="nav__Responsive-li-Redes"><a href="https://www.facebook.com/javier.kuznik/" target="_BLANK"><i class="fa-brands fa-facebook"></i></a></li>
                    <li class="nav__Responsive-li-Redes"><a href="https://twitter.com/Juachomos" target="_BLANK"><i class="fa-brands fa-twitter"></i></a></li>
                </div>
            </div>
        </ul>
    </nav>
</header>
