package wildfly.swarm.swagger;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.joda.time.DateTime;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@ApplicationScoped
@Path("/time")
@Api(value = "/time", description = "Get the time", tags = "time")
@Produces(MediaType.APPLICATION_JSON)
public class TimeResource {

  @GET
  @Path("/now")
  @ApiOperation(value = "Get the current time",
    notes = "Returns the time as a string",
    response = String.class
  )
  @Produces(MediaType.APPLICATION_JSON)
  public String get() {
    return String.format("{\"value\" : \"The time is %s\"}", new DateTime());
  }
}