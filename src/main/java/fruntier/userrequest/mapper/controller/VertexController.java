package fruntier.userrequest.mapper.controller;

import fruntier.userrequest.mapper.domain.VertexDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class VertexController {
    @PostMapping("/send-vertices-json")
    public ResponseEntity<String> receiveVerticesJson(@RequestBody Map<String, Object> payload) {
        // Process the received JSON data on server
        int expectedDistance = (int) payload.get("expectedDistance");
        Object vertices = payload.get("vertices");
        System.out.println("Received expectedDistance: " + expectedDistance);
        System.out.println("Received vertices: " + vertices);


        String response = "{\"status\": \"success\", \"message\": \"Vertices received successfully\"}";

        return ResponseEntity.ok(response);
    }

    @GetMapping("/get-data")
    public List<VertexDto> getDate() {
        return new routeSender().getList();
    }
}
