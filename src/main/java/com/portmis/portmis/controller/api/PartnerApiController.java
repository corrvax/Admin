package com.portmis.portmis.controller.api;

import com.portmis.portmis.controller.CrudController;
import com.portmis.portmis.model.entity.Partner;
import com.portmis.portmis.model.network.request.PartnerApiRequest;
import com.portmis.portmis.model.network.response.PartnerApiResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/partner")
public class PartnerApiController extends CrudController<PartnerApiRequest, PartnerApiResponse, Partner> {
}
