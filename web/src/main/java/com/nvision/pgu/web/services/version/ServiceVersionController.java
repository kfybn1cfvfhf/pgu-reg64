package com.nvision.pgu.web.services.version;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.lanit.samara.pgu.core.util.version.ServiceVersion;

// Реализация версий услуг refs 5328

@Controller
public class ServiceVersionController {

    @RequestMapping("/version")
    public String getVersions(Model model) {

        model.addAttribute("svcVersion", ServiceVersion.getMap());
        return "pages/service/version/version.ftl";
    }

    @RequestMapping(value = "/version.json", method = RequestMethod.GET, produces="application/json")
    @ResponseBody
    public String getVersionsAsJson(@RequestParam(value = "svc", required = false) String[] svc) {
        if (svc == null)
            return ServiceVersion.getVersionsAsJson();
        return ServiceVersion.getFilteredVersionsAsJson(svc);
    }
}
