
RiverLayout integration
-----------------------

Plugin page: [http://artifacts.griffon-framework.org/plugin/riverlayout](http://artifacts.griffon-framework.org/plugin/riverlayout)


Provides integration with [RiverLayout][1].

Usage
-----

The following nodes will become available on a View script upon installing this plugin

| *Node*      | *Type*                               |
| ----------- | ------------------------------------ |
| riverLayout | `se.datadosen.component.RiverLayout` |

This node accepts the follwing keywords as component constraints

 * **br, p** => page breaks
 * **left, right, center** => horizontal alignment
 * **vtop, vcenter** => vertical alignment
 * **hfill, vfill** => filling
 * **tab** => space between components

### Example

The following example is taken from Riverlayout's page

    application(title: 'Griffon + RiverLayout',
      size: [480, 320],
      locationByPlatform:true,
      iconImage: imageIcon('/griffon-icon-48x48.png').image,
      iconImages: [imageIcon('/griffon-icon-48x48.png').image,
                   imageIcon('/griffon-icon-32x32.png').image,
                   imageIcon('/griffon-icon-16x16.png').image]) {
        riverLayout()
        label 'Registration Form', constraints: 'center'
        label 'Name', constraints: 'p left'
        textField constraints: 'tab hfill'
        label 'Age', constraints: 'br'
        textField columns: 3,  constraints: 'tab'
        label 'Comment', constraints: 'br vtop'
        scrollPane(constraints: 'tab hfill vfill') {
            textArea()
        }
        button 'Ok', constraints: 'p center'
    }

[1]: http://www.datadosen.se/riverlayout/

