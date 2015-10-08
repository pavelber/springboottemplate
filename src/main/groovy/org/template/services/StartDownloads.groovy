package org.template.services

import groovy.transform.CompileStatic
import org.template.entity.IJournalRepository
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

/**
 * Created by Pavel on 9/29/2015.
 */
@Service
@CompileStatic
class StartDownloads implements Runnable {

    static Logger logger = LoggerFactory.getLogger(StartDownloads.class)

    @Autowired
    IJournalRepository repo



    @Override
    public void run() {
        def journals = repo.findAll()
        logger.info("Got {} journals", journals.size())
        journals.each {
            logger.info("Starting download for {} ", it.journal)
            // do something
        }


    }
}
