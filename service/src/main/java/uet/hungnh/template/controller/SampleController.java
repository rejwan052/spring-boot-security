package uet.hungnh.template.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uet.hungnh.template.dto.SampleDTO;
import uet.hungnh.template.service.ISampleService;

@RestController
@RequestMapping(value = APIController.API_ENDPOINT)
public class SampleController {

    @Autowired
    private ISampleService sampleService;

    @GetMapping
    public String sample() {
        return "Sample OK!";
    }

    @PutMapping
    public SampleDTO create(@RequestBody SampleDTO sampleDTO) {
        return sampleService.create(sampleDTO);
    }

    @GetMapping(value = "/{id}")
    public SampleDTO retrieve(@PathVariable("id") Integer id) {
        return sampleService.retrieve(id);
    }

    @PostMapping
    public SampleDTO update(@RequestBody SampleDTO sampleDTO) {
        return sampleService.update(sampleDTO);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable("id") Integer id) {
        sampleService.delete(id);
    }
}
