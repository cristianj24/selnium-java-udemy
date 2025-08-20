Feature: Navigation bar
    To see the subpages
    Without logging in
    I can click the navigation bar links
    Background: I am on the Free Range testers web without logging in
        Given I navigate to wwww.freerangetesters.com
    @NavigationBar
    Scenario Outline: I can access the subpages through the navigation bar
        When I go to <section> using the navigation bar
        Examples:
            | section   |
            | Cursos    |
            | Recursos  |
            | Mentorías |
            | Talleres  |
            | Blog      |

    @Courses
    Scenario: Courses are presented correctly to potencial customers
        When I go to Cursos using the navigation bar
        And The user select Introduccion al Testing

    @Plans @Courses
    Scenario: Users can select a plan when sigining up
        When I select buy now
        Then make the payment
