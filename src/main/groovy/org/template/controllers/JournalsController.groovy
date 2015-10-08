package org.template.controllers

import groovy.json.JsonBuilder
import org.template.entity.IJournalRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody

/**
 * Created by Pavel on 10/5/2015.
 */
@Controller
class JournalsController {




    @RequestMapping("/journals")
    @ResponseBody String get() {
        def journals = repo.findAll()
        journals.each {it.user = null}
        return   new JsonBuilder( journals).toPrettyString()
    }
}
