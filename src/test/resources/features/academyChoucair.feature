# Autor: XXXXXXXXXX
  @Stories
  Feature: Academy Chousair
    As a user, I want to learn how to automate in screenplay at the Choucair Academy with the automatimation course
    @scenario1
    Scenario: Search for a automation course
      Given than brandon wants to learn automation at the academy Choucair
      | strUser  | strPassword|
      | 1001174178| Choucair2021*|
      When he search for the course on the choucair academy platform
      | strCourse |
      | Workshop de Automatización |
      Then he finds the course called resources
      | strCourse |
      | Workshop de Automatización |

