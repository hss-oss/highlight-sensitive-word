/**
 * Alipay.com Inc. Copyright (c) 2004-2024 All Rights Reserved.
 */
package com.knife4j.demo.config;

import com.github.houbb.sensitive.word.api.IWordDeny;
import org.springframework.stereotype.Component;
import java.util.List;

/**
 *
 * @author yuwei
 * @version $Id: MyDdWordDeny.java, v 0.1 2024年07月19日 9:55 PM yuwei Exp $
 */
@Component
public class MyDdWordDeny extends LocalDictionary implements IWordDeny {


    @Override
    public List<String> deny() {
        return readWords("敏感词库.txt");
    }
}