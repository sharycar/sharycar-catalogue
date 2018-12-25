package sharycar.catalogue.api;


import java.security.MessageDigest;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;
import sharycar.catalogue.persistence.Car;
import sharycar.catalogue.persistence.Reservation;

@Path("/catalogue")
@RequestScoped
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CatalogueResource {

    @PersistenceContext
    private EntityManager em;


    /**
     *  Get all cars
     */
    @GET
    public Response getCars() {

        TypedQuery<Car> query = em.createNamedQuery("Car.findAll", Car.class);

        List<Car> cars = query.getResultList();

        return Response.ok(cars).build();

    }

}
