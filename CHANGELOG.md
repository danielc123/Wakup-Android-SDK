# Change Log
All notable changes to this project will be documented in this file.
This project adheres to [Semantic Versioning](http://semver.org/).

## [Unreleased]

No pending changes

## [2.1.5] - 2017-10-18

### Fixed

* Fixed issue that was causing offer detail view to display at half size while loading related offers

### Changed

Version updates to support Android SDK v26:

* Updated Android build tools and target SDK to latest available version: 26
* Updated Android Support V4 dependency to latest version: 26.1.0


## [2.1.4] - 2017-05-16

### Fixed

- Improved error handling for nearest offer Map Widget


## [2.1.2] - 2017-04-04

### Fixed

- Fixed issue with MapWidget that could cause error when there is no offers nearby

### Changed
- Updated Android Play Services library version to 10.2.1

## [2.1.1] - 2016-11-14

### Fixed
- Fixed an error that was preventing the sharing of offers due to storage permissions issues
- Fixed appearance and improved behavior to avoid issues of main activity navigation bar

### Added
- Added Map and Featured Offers widget views that can be included outside Wakup section in the client application

### Changed
- Updated Android build tools and target SDK to last available version: 25
- Updated Android Play Services library version to 9.8.0


## [2.0.2] - 2016-09-13

### Added
- Included offer tags functionality: now it is possible to search and navigate through the offer tags
- Included offer redemption codes viewing (mainly barcode and QR Codes)

### Changed
- Replaced ActionBar by AppCompat Toolbar with material design
- Replaced offers ListView by RecyclerView
- Offer categories used to filter are now customizable in SDK setup
- Store map pin icons are now customizable depending on offer tags in SDK setup
- Now it is required to set `showBackInRoot(true)` in setup to show navigation back in main activity
- Updated Android build tools and target SDK to last available version: 24
- Updated Android Play Services library version to 9.4.0
 
## [1.2.2] - 2016-02-29
### Changed
- Improved displayed message and behavior on connectivity errors
- Included location permission request to user for Android 6+
- _Center in my location_ button will not be displayed in Map View when location is disabled

## [1.2.1] - 2016-02-22
### Fixed
- Application should not crash on opening map activity when offers are not yet loaded

## [1.2.0] - 2016-02-22
### Added
- Implemented user statistics and device information reporting
- Added 'report offer error' functionality in offer details view
- Added CHANGELOG file to keep track of changes between versions

### Changed
- `largeHeap` option is now enabled by default in application manifest to avoid reaching max heap space when loading offer images. This change should avoid _OutOfMemory_ errors in devices with limited memory.


## [1.1.0] - 2016-02-8
### Added
- Included font typeface customization

### Changed
- Icon customization instructions should now be cleaner
- General improvements in UI customization:
  - ActionBar
  - Search Box
  - Action and Search Filter buttons

## [1.0.1] - 2016-01-27
### Changed
- Removed unnecessary Play Services dependencies to reduce method count

## 1.0.0 - 2016-01-20
### Added
- First fully functional public release.

[Unreleased]: https://github.com/Wakup/Wakup-Android-SDK/compare/v2.1.5...HEAD
[2.1.5]: https://github.com/Wakup/Wakup-Android-SDK/compare/v2.1.4...v2.1.5
[2.1.4]: https://github.com/Wakup/Wakup-Android-SDK/compare/v2.1.2...v2.1.4
[2.1.2]: https://github.com/Wakup/Wakup-Android-SDK/compare/v2.1.1...v2.1.2
[2.1.1]: https://github.com/Wakup/Wakup-Android-SDK/compare/v2.0.2...v2.1.1
[2.0.2]: https://github.com/Wakup/Wakup-Android-SDK/compare/v1.2.2...v2.0.2
[1.2.2]: https://github.com/Wakup/Wakup-Android-SDK/compare/v1.2.1...v1.2.2
[1.2.1]: https://github.com/Wakup/Wakup-Android-SDK/compare/v1.2.0...v1.2.1
[1.2.0]: https://github.com/Wakup/Wakup-Android-SDK/compare/v1.1.0...v1.2.0
[1.1.0]: https://github.com/Wakup/Wakup-Android-SDK/compare/v1.0.1...v1.1.0
[1.0.1]: https://github.com/Wakup/Wakup-Android-SDK/compare/v1.0.0...v1.0.1