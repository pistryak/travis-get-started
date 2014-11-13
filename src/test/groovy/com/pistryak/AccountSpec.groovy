package com.pistryak

import spock.lang.Specification

class AccountSpec extends Specification {
    def "Withdraw"() {
        given:
        def account = new Account(10)

        account.metaClass.minus = account.&withdraw

        when:
        account - 7

        then:
        account.balance == 3
    }
}