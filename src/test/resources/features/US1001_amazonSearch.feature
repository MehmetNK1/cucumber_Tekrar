@tumu
Feature: US1001 Kullanici Amazon Sayfasinda Arama Yapar
  @nutellla
  Scenario: TC01 kullanici amazonda Nutella aratir
    Given kullanici amazon anasayfasinda
    Then kullanici Nutella icin arama yapar
    And sonuclarin Nutella icerdigini test eder
    And sayfayi kapatir
    @java
    Scenario: TC01 kullanici amazon Java aratir
      Given kullanici amazon anasayfasinda
      Then kullanici Java icin arama yapar
      And sonuclarin Java icerdigini test eder
      And sayfayi kapatir
      @iphone
      Scenario: TC03 kullanici iphone aratir
        When kullanici amazon anasayfasinda
        And kullanici iphone icin arama yapar
        Then sonuclarin iphone oldugunu icerdigini test eder
        And sayfayi kapatir