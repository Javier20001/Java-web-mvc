<%-- 
    Document   : modalSingOut
    Created on : 4 ago. 2022, 20:36:18
    Author     : kuzni
--%>

<div class="modal fade" id="modalSingOut" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Cerrar seccion</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
            </div>
            <form id="formAgregarAlumno" 
                  method="post" class="was-validated">
                <div class="modal-body">
                    <p>¿Seguro que quieres cerrar tu cuenta?</p>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
                    <button type="submit" class="btn btn-secondary">Agregar</button>
                </div>
            </form>
        </div>
    </div>
</div>
