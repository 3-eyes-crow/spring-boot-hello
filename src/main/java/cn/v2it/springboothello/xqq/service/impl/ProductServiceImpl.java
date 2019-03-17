package cn.v2it.springboothello.xqq.service.impl;

import cn.v2it.springboothello.xqq.entity.Product;
import cn.v2it.springboothello.xqq.mapper.ProductMapper;
import cn.v2it.springboothello.xqq.service.IProductService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author xqq
 * @since 2019-03-18
 */
@Service
public class ProductServiceImpl extends ServiceImpl<ProductMapper, Product> implements IProductService {

}
