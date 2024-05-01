package top.angeya.service;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import top.angeya.entity.Racket;
import top.angeya.mapper.RacketMapper;

import java.util.List;

/**
 * 球拍service
 * @author: angeya
 * @date: 2024/5/1 21:45
 * @description:
 */
@Service
public class RacketService extends ServiceImpl<RacketMapper, Racket> {

    /**
     * 保存球拍数据
     * @param racket 球拍数据
     * @return 保存后的球拍数据
     */
    public Racket saveRacket(Racket racket) {
        this.saveOrUpdate(racket);
        return racket;
    }

    /**
     * 根据id获取球拍数据
     * @param id 球拍id
     * @return 球拍数据
     */
    public Racket getByRacketId(String id) {
        return this.getById(id);
    }

    /**
     * 获取所有球拍数据
     * @return 球拍数据
     */
    public List<Racket> getAllRacket() {
        return this.list();
    }
}
