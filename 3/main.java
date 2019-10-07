function rising_tide () {
    basic.showLeds(`
        . . . . .
        . . . . .
        . . . . .
        . . . . .
        # # # # #
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . .
        . . . . .
        . . . . .
        # # # # #
        . . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . .
        . . . . .
        # # # # #
        . . . . .
        . . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . .
        # # # # #
        . . . . .
        . . . . .
        . . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        # # # # #
        . . . . .
        . . . . .
        . . . . .
        . . . . .
        `)
    basic.pause(500)
}
input.onButtonPressed(Button.B, function () {
    B_count += 1
    basic.pause(100)
    while (a_enable == true && B_count == 0) {
        firework()
        if (Button.B) {
            break
        }
    }
    while (a_enable == true && B_count == 1) {
        wave()
        if (Button.B) {
            break
        }
    }
    while (a_enable == true && B_count == 2) {
        rising_tide()
        if (Button.B) {
            break
        }
    }
    while (a_enable == true && B_count == 3) {
        sweep()
        if (Button.B) {
            break
        }
    }
    while (a_enable == true && B_count == 4) {
        firework()
        if (Button.B) {
            break
        }
    }
})
input.onButtonPressed(Button.A, function () {
    basic.pause(2000)
    a_enable = true
    basic.showString("sleep mode on")
})
function firework () {
    basic.showLeds(`
        # . # . #
        . # # # .
        # # . # #
        . # # # .
        # . # . #
        `)
    basic.pause(500)
    basic.showLeds(`
        . # . # .
        # . . . #
        . . # . .
        # . . . #
        . # . # .
        `)
    basic.pause(500)
}
function sweep () {
    basic.showLeds(`
        . . . . #
        . . . . #
        . . . . #
        . . . . #
        . . . . #
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . # .
        . . . # .
        . . . # .
        . . . # .
        . . . # .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . # . .
        . . # . .
        . . # . .
        . . # . .
        . . # . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . # . . .
        . # . . .
        . # . . .
        . # . . .
        . # . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        # . . . .
        # . . . .
        # . . . .
        # . . . .
        # . . . .
        `)
    basic.pause(500)
}
function wave () {
    basic.showLeds(`
        . . . . .
        . . . . .
        . . . . .
        . . . . .
        . . . . #
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . .
        . . . . .
        . . . . .
        . . . . #
        . . . # .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . .
        . . . . .
        . . . . #
        . . . # .
        . . # . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . .
        . . . . #
        . . . # .
        . . # . .
        . # . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . . #
        . . . # .
        . . # . .
        . # . . .
        # . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . . # .
        . . # . .
        . # . . .
        # . . . .
        . . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . . # . .
        . # . . .
        # . . . .
        . . . . .
        . . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        . # . . .
        # . . . .
        . . . . .
        . . . . .
        . . . . .
        `)
    basic.pause(500)
    basic.showLeds(`
        # . . . .
        . . . . .
        . . . . .
        . . . . .
        . . . . .
        `)
    basic.pause(500)
}
let a_enable = false
let B_count = 0
B_count = 0