package untitled.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import untitled.domain.*;

@Component
public class BasicHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Basic>> {

    @Override
    public EntityModel<Basic> process(EntityModel<Basic> model) {
        return model;
    }
}
