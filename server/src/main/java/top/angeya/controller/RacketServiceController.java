package top.angeya.controller;

import org.springframework.web.bind.annotation.*;
import top.angeya.entity.Racket;
import top.angeya.service.RacketService;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: angeya
 * @date: 2024/5/1 22:26
 * @description:
 */
@RequestMapping("racket")
@RestController
public class RacketServiceController {

    public RacketServiceController() {
        System.out.println("哈哈");
    }

    @Resource
    private RacketService racketService;

    /**
     * 保存球拍数据
     * @param racket 球拍数据
     * @return 保存后的球拍数据
     */
    @PostMapping("saveRacket")
    public Racket saveRacket(@RequestBody Racket racket) {
        return this.racketService.saveRacket(racket);
    }

    /**
     * 根据id获取球拍数据
     * @param id 球拍id
     * @return 球拍数据
     */
    @GetMapping("getByRacketId")
    public Racket getByRacketId(@RequestParam String id) {
        return this.racketService.getByRacketId(id);
    }

    /**
     * 获取所有球拍数据
     * @return 球拍数据
     */
    @GetMapping("getAllRacket")
    public List<Racket> getAllRacket() {
        return this.racketService.getAllRacket();
    }
}
