package br.com.economiaazul.resource;

import br.com.economiaazul.beans.Ong;
import br.com.economiaazul.bo.OngBO;
import br.com.economiaazul.service.OngService;
import com.google.gson.Gson;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.*;

import java.sql.SQLException;
import java.util.List;

@Path("/ongs")
public class OngResource {

    private OngService ongService;
    private OngBO ongBO;


    public OngResource() throws ClassNotFoundException, SQLException {
        this.ongService = new OngService();
        this.ongBO = new OngBO();
    }

    @GET
    @Path("/teste")
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Testando API";
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarOngs() {
        List<Ong> listaOngs = null;
        try {
            listaOngs = ongService.listarOngs();
        } catch (Exception exception) {
            exception.printStackTrace();
        }

        Gson gson = new Gson();
        String json = gson.toJson(listaOngs);

        return Response.ok(json).build();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response inserirOng(Ong ong, @Context UriInfo uriInfo) {
        try {
            ongBO.inserirBO(ong);
            UriBuilder builder = uriInfo.getAbsolutePathBuilder();
            builder.path(ong.getIdOng());
            return Response.created(builder.build()).entity(ong).build();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST)
                    .entity("Erro no cadastro da ONG: " + e.getMessage()).build();
        }
    }
}

