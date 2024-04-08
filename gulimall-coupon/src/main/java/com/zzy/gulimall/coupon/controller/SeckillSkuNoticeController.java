package com.zzy.gulimall.coupon.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zzy.gulimall.coupon.entity.SeckillSkuNoticeEntity;
import com.zzy.gulimall.coupon.service.SeckillSkuNoticeService;
import com.zzy.common.utils.PageUtils;
import com.zzy.common.utils.R;



/**
 * 秒杀商品通知订阅
 *
 * @author zzy
 * @email 153730598@qq.com
 * @date 2024-04-09 00:14:49
 */
@RestController
@RequestMapping("coupon/seckillskunotice")
public class SeckillSkuNoticeController {
    @Autowired
    private SeckillSkuNoticeService seckillSkuNoticeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = seckillSkuNoticeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
		SeckillSkuNoticeEntity seckillSkuNotice = seckillSkuNoticeService.getById(id);

        return R.ok().put("seckillSkuNotice", seckillSkuNotice);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice){
		seckillSkuNoticeService.save(seckillSkuNotice);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SeckillSkuNoticeEntity seckillSkuNotice){
		seckillSkuNoticeService.updateById(seckillSkuNotice);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
		seckillSkuNoticeService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
