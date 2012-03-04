/*
 * griffon-riverlayout: RiverLayout Griffon  plugin
 * Copyright 2010-2012 and beyond, Andres Almiray
 *
 * griffon-riverlayout is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License
 * as published by the Free Software Foundation. griffon-riverlayout is also
 * available under typical commercial license terms - see
 * smartclient.com/license.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 */

/**
 * @author Andres Almiray
 */
class RiverlayoutGriffonPlugin {
    // the plugin version
    String version = '0.3'
    // the version or versions of Griffon the plugin is designed for
    String griffonVersion = '0.9.5 > *'
    // the other plugins this plugin depends on
    Map dependsOn = [swing: '0.9.5']
    // resources that are included in plugin packaging
    List pluginIncludes = []
    // the plugin license
    String license = 'GNU LGPL 2.1'
    // Toolkit compatibility. No value means compatible with all
    // Valid values are: swing, javafx, swt, pivot, gtk
    List toolkits = ['swing']
    // Platform compatibility. No value means compatible with all
    // Valid values are:
    // linux, linux64, windows, windows64, macosx, macosx64, solaris
    List platforms = []
    // URL where documentation can be found
    String documentation = ''
    // URL where source can be found
    String source = 'https://github.com/griffon/griffon-riverlayout-plugin'

    List authors = [
        [
            name: 'Andres Almiray',
            email: 'aalmiray@yahoo.com'
        ]
    ]
    String title = 'RiverLayout integration'
    String description = '''
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
'''
}
