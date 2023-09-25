@register
Feature:Register
  Background:Grinara_Register
  Scenario: Grinara web sitesinde register
    Given User "https://grinara.de/" sayfasina gider
    When User account sekmesine tiklar
    And User register sekmesine tiklar
    And User mail adresini girer
    And User register butonuna basar
