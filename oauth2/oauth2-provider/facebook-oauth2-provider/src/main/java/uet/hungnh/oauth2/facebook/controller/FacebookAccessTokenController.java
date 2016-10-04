package uet.hungnh.oauth2.facebook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uet.hungnh.oauth2.common.service.IAccessTokenService;
import uet.hungnh.oauth2.dto.AccessTokenDTO;
import uet.hungnh.oauth2.dto.AccessTokenValidationResultDTO;

@RestController
@RequestMapping(value = "/oauth/facebook/access-token")
public class FacebookAccessTokenController {

    @Autowired
    private IAccessTokenService tokenService;

    @PostMapping("/validate")
    public AccessTokenValidationResultDTO validateAccessToken(@RequestBody AccessTokenDTO accessToken) {
        return tokenService.validateAccessToken(accessToken); //TODO: frontend service request
    }
}
