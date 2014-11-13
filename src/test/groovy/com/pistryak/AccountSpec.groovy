package com.pistryak

import spock.lang.Specification

class AccountSpec extends Specification {
    def "Withdraw"() {
        given:
        def account = new Account(5)

        account.metaClass.minus = account.&withdraw

        when:
        account - 3

        then:
        account.balance == 2
    }
}