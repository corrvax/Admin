package com.portmis.portmis.controller.api;

import com.portmis.portmis.controller.CrudController;
import com.portmis.portmis.model.entity.User;
import com.portmis.portmis.model.network.Header;
import com.portmis.portmis.model.network.request.UserApiRequest;
import com.portmis.portmis.model.network.response.UserApiResponse;
import com.portmis.portmis.model.network.response.UserOrderInfoApiResponse;
import com.portmis.portmis.service.UserApiLogicService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserApiController extends CrudController<UserApiRequest, UserApiResponse, User> {

    private final UserApiLogicService userApiLogicService;

    @GetMapping("/{id}/orderInfo")
    public Header<UserOrderInfoApiResponse> orderInfo(@PathVariable Long id){
        return userApiLogicService.orderInfo(id);
    }

    @GetMapping("")
    public Header<List<UserApiResponse>> findAll(@PageableDefault(sort = { "id" }, direction = Sort.Direction.ASC) Pageable pageable){
        log.info("{}",pageable);
        return userApiLogicService.search(pageable);
    }
}
